import java.util.Random;
import java.util.Scanner;

    public class mayin {
        int rowNumber =15, colNumber = 15, size; // satır ve sütun oluştu değer de atayabilirdik ama constructerla alıcam ben
        int[][] map;
        int[][] board; //kullanıcının oynadığı alan
        Random random = new Random(); //sınıf tanımladık
        Scanner scan = new Scanner(System.in);

        //kullanıcıdan kaçlık oyun oynamak istiyorsak constructer oluşturduk almak için
        mayin(int rowNumber, int colNumber) {
            this.rowNumber = rowNumber; //aldığımız değerle uysun verdiğimiz tablo
            this.colNumber = colNumber;
            this.map = new int[rowNumber][colNumber];
            this.board = new int[rowNumber][colNumber];
            this.size = rowNumber * colNumber; //boyut
        }

        public void run() {
            prepareGame();
            print(map); //ekrana bastırılanı çalıştırmak için
        }

        public void prepareGame() //rastgele mayın döşeme
        {
            int randRow, randCol, count = 0;
            while (count != (size / 4)) //for olsa aynı yere ekleme yapabilirdi while kullandık
            {
                randCol = random.nextInt(colNumber); //random belirlediği yerde mayın yoksa koy
                randRow = random.nextInt(rowNumber);
                if (map[randRow][randCol] != -1) //-1 mayın olsun
                {
                    map[randRow][randCol] = -1; //yukarda mayın eklenmemişse ekle
                    count++; //değer eklediysek sayaç artsın
                }

            }

        }

        public void print(int[][] arr) //ekrana bastırdık
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] >= 0)
                        System.out.print(" "); //sıfırdan farklı ise boşluk koy güzel durması için yaptık
                    System.out.print(arr[i][j] + "");
                }
                System.out.println();
            }

        }
    }
