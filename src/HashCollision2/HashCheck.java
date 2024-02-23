package HashCollision2;

public class HashCheck {
    private String name;
    private int id;

    public HashCheck(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int hashCode() {
        return id * 133;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HashCheck other = (HashCheck) obj;
        return id == other.id && name.equals(other.name);
    }
}

