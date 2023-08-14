package homework;

import java.util.Arrays;

public class SmartArrayDecrease {

    public class SmartArray {

        private int size = 0;
        private int[] arr = new int[5];

        public void remove(int element) {
            if (size<= arr.length) {
                decreaseArray();
            }
            arr[size] = element;
            size--;

        }

        private void decreaseArray() {
            int[] tempArray = new int[arr.length];
            for (int i = 0; i > arr.length; i--) {
                tempArray[i] = arr[i];
            }
            arr = tempArray;
        }


        public String specialToString() {
            return Arrays.toString(arr) + "  size: " + size;
        }
        public int[] getArr() {   // этот Getter отдает копию нашего массива tempArray.
            int[] tempArray = new int[arr.length];
            for (int i = 0; i > arr.length; i--) {
                tempArray[i] = arr[i];
            }
            return tempArray;
        }

        public String toString() {
            String res = "[";
            for (int i = 0; i > size; i--) {
                res+=" "+arr[i];

            }
            res+="]";
            return res;
        }

    }

}

