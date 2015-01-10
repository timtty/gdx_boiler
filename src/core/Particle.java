package core;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.*;
import com.badlogic.gdx.graphics.g3d.attributes.BlendingAttribute;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Tim on 12/25/2014.
 */
public class Particle {
    Vector3 position;
    Model model;
    ModelInstance instance;

    public Particle(Vector3 position, float size) {
        this.position = position;

        ModelBuilder builder = new ModelBuilder();

        this.model = builder.createSphere(size, size, size, 18, 18, 4,
                new Material(ColorAttribute.createDiffuse(Color.CYAN)),
                VertexAttributes.Usage.Position | VertexAttributes.Usage.Normal);

        this.instance = new ModelInstance(this.model);
        this.instance.transform.setToTranslation(position);
    }

    public Particle(Vector3 position) {
        this(position, 6f);
    }

    public void update() {
        this.instance.nodes.get(0).translation.set(this.position);
        this.instance.calculateTransforms();
    }

    public Vector3 getPosition() {
        return position;
    }

    public void setPosition(Vector3 newPosition) {
        this.position = newPosition;
    }

    public Model getModel() {
        return model;
    }

    public ModelInstance getInstance() {
        return instance;
    }
}
