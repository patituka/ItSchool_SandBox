package com.socgen.javabasicsreviews;

public enum CardinalPoint {

    NORTH(false) {
	@Override
	public String getPreferedSport() {
	    return "Sky";
	}
    },
    SOUTH(true) {
	@Override
	public String getPreferedSport() {
	    return "Surf";
	}
    },
    EAST(false) {
	@Override
	public String getPreferedSport() {
	    return "Karate";
	}
    },
    WEST(true) {
	@Override
	public String getPreferedSport() {
	    return "Equitation";
	}
    };

    private boolean hot = false;

    private CardinalPoint(boolean hot) {
	this.hot = hot;
    }

    public boolean isHot() {
	return hot;
    }

    // constant-specific method
    // toutes mes constantes doivent implémenter cette méthode
    public abstract String getPreferedSport();

}
