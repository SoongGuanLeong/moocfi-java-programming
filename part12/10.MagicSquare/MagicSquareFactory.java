
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int x = (size - 1) / 2;                 // col
        int y = 0;                       // row
        int val = 1;
        square.placeValue(x, y, val);

        while (true) {
            x = (x + 1) % size;
            y = (y + size - 1) % size;
            val += 1;

            if (square.readValue(x, y) == 0) {
                square.placeValue(x, y, val);
            } else {
                x = (x + size - 1) % size;
                y = (y + 2) % size;

                if (square.readValue(x, y) != 0) {
                    break;
                }
                square.placeValue(x, y, val);
            }
        }
        return square;
    }

}
