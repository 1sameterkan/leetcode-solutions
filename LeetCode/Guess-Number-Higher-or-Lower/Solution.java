1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        
13        int left = 1;
14        int right = n;
15        
16        while(left <= right){
17            
18            int mid = left + (right - left) / 2;    // mevcut tahmin ettiğimiz sayı
19
20            // guess(mid) --> burdan gönderdiğimiz mid değerini pick ile kıyaslar.ve o sonucu döndürür.
21            if(guess(mid) == -1){  // pick < mid
22                right = mid - 1;
23            }
24            else if(guess(mid) == 1){   // pick > mid
25                left = mid + 1;
26            }
27            else{   // pick = mid
28                return mid; 
29            }
30        }
31        return -1;
32    }
33}