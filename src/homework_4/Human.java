package homework4;

public class Human {
    public class Head {
        String think;
        public String think(){
            return "Я думаю что ";
        }
    }
    public class Leg  {
        private int length;
        public String length(int length) {
            if (length < 30) {
            return "У меня короткие ноги";
            }
            else {
            return "у меня длинные ноги";                }
        }
    }
    public class Hand {
        String strong;
        public String Strong() {
            return "Мои руки сильные и я смогу поднять эту гирю";
        }
        public String getStrong() {
            return strong;
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
        Head head = h.new Head();
        Leg leg = h.new Leg();
        Hand hand = h.new Hand();
        System.out.println(head.think() + leg.length(50));
        System.out.println(head.think() + hand.Strong());
    }
}