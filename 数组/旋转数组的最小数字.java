/**
 * @Author Natasha
 * @Description https://www.nowcoder.com/practice/9f3231a991af4f55b95579b44b7a01ba?tpId=13&tqId=11159&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tab=answerKey
 * @Date 2021/5/17 15:11
 **/
public class 旋转数组的最小数字 {
    public int minNumberInRotateArray(int [] array) {
        int l = 0;
        int r = array.length - 1;
        while(l < r){
            //特殊情况 如 0 1 1 1 1
            if(array[l] < array[r]){
                return array[l];
            }
            int mid = (r - l)/ 2 + l;
            //中间值比最左边值大，说明mid处于递增序列上
            if(array[mid] > array[l]){
                l = mid;
                //中间值比最左边值小，但比最右边值大，说明该值处于“山”，故范围应该位于上坡段
            }else if(array[mid] < array[r]){
                r = mid;
            }
            l++;
        }
        return array[l];
    }
}
