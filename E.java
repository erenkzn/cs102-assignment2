class E {
        /**
        ikinci parametre true ise tek sayılar, false ise çift sayıları topluyo
         */
        public static int sumEvenOdd (int[] arr, boolean isOdd) {
            int result = 0;

            for (int i = 0; i < arr.length; i++) {
                if (isOdd) {
                    if (i%2 == 1) {
                        result += arr[i];
                    }
                }
                else {
                    if (i%2 == 0) {
                        result += arr[i];
                    }
                }
            }

            return result;
        }
    }