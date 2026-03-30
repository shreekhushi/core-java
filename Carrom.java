class Carrom{
    String boardType;
    int size;
    String material;
    int coins;
    int price;

    Carrom() {
        System.out.println("Carrom default constructor");
    }

    Carrom(String boardType) {
        this.boardType = boardType;
    }

    Carrom(String boardType, int size) {
        this.boardType = boardType;
        this.size = size;
    }

    Carrom(String boardType, int size, String material) {
        this.boardType = boardType;
        this.size = size;
        this.material = material;
    }

    Carrom(String boardType, int size, String material, int coins) {
        this.boardType = boardType;
        this.size = size;
        this.material = material;
        this.coins = coins;
    }

    Carrom(String boardType, int size, String material, int coins, int price) {
        this.boardType = boardType;
        this.size = size;
        this.material = material;
        this.coins = coins;
        this.price = price;
    }

    void display() {
        System.out.println(boardType + " " + size + " " + material + " " + coins + " " + price);
    }
}