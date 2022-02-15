package vehicle;

public abstract class SpareParts {

    private String condition;
    private String type;

    public SpareParts(String condition, String type) {
        this.condition = condition;
        this.type = type;
    }

    public String getCondition() {
        return condition;
    }

    public String getType() {
        return type;
    }
}
