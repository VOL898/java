import java.util.*;

public enum Type{
	HARE, TURTLE, UNDEFINED;

	public static Type from(String type) {
		if ( Objects.isNull(type) ) {
			return UNDEFINED;
		}

		switch ( type.trim().toLowerCase() ) {
			case "hare":   return HARE;
			case "turtle": return TURTLE;
		}

		return UNDEFINED;
	}

	public boolean isUndefined() {
		return UNDEFINED.equals(this);
	}

	public boolean isHare() {
		return HARE.equals(this);
	}
}

