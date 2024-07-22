// define class with card structures(color, value)
class UnoCard {
    enum Color { RED, GREEN, BLUE, YELLOW, WILD }
    private Color color;
    private String value;

    static final List<String> VALUES = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Skip", "Reverse", "Draw Two", "Wild", "Wild Draw Four");

    // Constructor for value and color
    UnoCard(Color color, String value) {
        if (!VALUES.contains(value) || (color == Color.WILD && !value.startsWith("Wild"))) {
            throw new IllegalArgumentException("Invalid card");
        }
        this.color = color;
        this.value = value;
    }
