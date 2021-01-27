public class probs {
    static Item[] items = { new Armor(), new Weapon(), new Holdable(), new Item(), new Wearable() };
    static Holdable h = (Holdable) items[0];
    static Wearable w = (Wearable) items[1];
//cannot cast weapon to wearable

    public static void main(String[] args) {
        /*3. Given the class hierarchy above and code below, mark all Java statement which compile. If a
        statement does not compile, indicate why.
        */
        w.toString(); //yes run runf rom weapon crashes because line 4
        String s = h.numHands();
        items[4].

                damage(); //wearable

        items[2].

                getWeight();
        // 4. Given the class hierarchy above and code from question 3, indicate from which class the following lines run. If an exception is thrown, indicate which exception and why. All lines compile.
        w.toString();
        ((Wearable) items[2]). //ClassCastException .damage(5);

        items[1].

                toString();
        h.getWeight();
        h.damage(20);
        w.numHands();
    }

    static class Item {
        public int damage(int hit) {
            return hit + 2;
        }

        public int getWeight() {
            return 10;
        }
    }

    static class Holdable extends Item {
        public int numHands() {
            return 2;
        }
    }

    static class Wearable extends Holdable {
        public int getWeight() {
            return 20;
        }

        public boolean isValidLocation(Location loc) {
            return loc.getX() == 1;
        }
    }

    static class Weapon extends Holdable {
        public int damage() {
            return 15;
        }

        public String toString() {
            return "Weapon";
        }
    }

    static class Armor extends Wearable {
        public String toString() {
            return "Armor";
        }

        public int damage(int h) {
            return h * 2;
        } //yes runs from armor

    }

    class Location {
        private int x, y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

