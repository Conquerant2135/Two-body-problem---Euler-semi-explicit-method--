package body;

import position.Point;

public class Planet {

    double mass;
    Point position;
    Point vitesse;
    Point acceleration;
    double rayon;
    double G = 6.67430e-11;

    public Planet() {

    }

    public Planet(double mass, Point position, Point vitesse, Point acceleration, double rayon) {
        this.mass = mass;
        this.position = position;
        this.vitesse = vitesse;
        this.acceleration = acceleration;
        this.rayon = rayon;
    }

    // --------------------------------------------------------------------------------------------
    public double getMass() {
        return mass;
    }

    public Point getPosition() {
        return position;
    }

    public Point getVitesse() {
        return vitesse;
    }

    public Point getAcceleration() {
        return acceleration;
    }

    public double getRayon() {
        return rayon;
    }

    // --------------------------------------------------------------------------------------------
    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setVitesse(Point vitesse) {
        this.vitesse = vitesse;
    }

    public void setAcceleration(Point acceleration) {
        this.acceleration = acceleration;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // --------------------------------------------------------------------------------------------
    public double gravitationalForce(Planet other) {
        double distance = this.position.distance(other.position);
        return (G * this.mass * other.mass) / (distance * distance);
    }

    public void acceleration(Planet other, double dt) {
        double mu = G * other.mass;
        double distance = this.position.distance(other.position);
        double acc = mu / (distance * distance * distance);
        Point sub = other.position.subtract(this.position);
        this.acceleration.setX(sub.getX() * acc);
        this.acceleration.setY(sub.getY() * acc);
    }

    public void velocity(double dt) {
        this.vitesse.setX(this.vitesse.getX() + this.acceleration.getX() * dt);
        this.vitesse.setY(this.vitesse.getY() + this.acceleration.getY() * dt);
    }

    public void position(double dt) {
        this.position.setX(this.position.getX() + this.vitesse.getX() * dt);
        this.position.setY(this.position.getY() + this.vitesse.getY() * dt);
    }

    public void move(double dt, Planet other) {
        this.acceleration(other, dt);
        System.out.println("Acceleration: " + this.acceleration.afficherPosition());
        this.velocity(dt);
        System.out.println("Vitesse: " + this.vitesse.afficherPosition());
        this.position(dt);
        System.out.println("Position: " + this.position.afficherPosition());
    }
}
