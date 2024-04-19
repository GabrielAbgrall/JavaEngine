package fr.gabrielabgrall.swingengine.gameobject;

import fr.gabrielabgrall.swingengine.utils.Vector2;

import java.awt.*;

public class GameObject {

    protected Vector2 position;
    protected Image mesh;

    public GameObject(Vector2 position, Image mesh) {
        this.position = position;
        this.mesh = mesh;
    }

    public GameObject(Vector2 position) {this(position, null);}

    public GameObject() {this(new Vector2(0, 0), null);}

    public void update(long elapsed) {
    }

    public void updateMesh(){
    }

    public Image getMesh() {
        return mesh;
    }

    public void setMesh(Image mesh) {
        this.mesh = mesh;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public void move(Vector2 movement) {
        this.position = this.position.add(movement);
    }
}