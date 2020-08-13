package ArithmeticOperations;

public class Sum {
        private int value;
        private int carry;

        private Sum(int value, int carry){
            this.value = value;
            this.carry = carry;
        }

        public static Sum createSum(int value, int carry) {

            return new Sum(value, carry);

        }

        public int getValue(){
            return this.value;
        }

        public int getCarry(){
            return this.carry;
        }
}
