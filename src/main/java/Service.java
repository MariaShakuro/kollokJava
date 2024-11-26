import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    public List<Long>calculateFactorials(int n){
        List<Long>factorials=new ArrayList<>();
        for(int i=1;i<=n;i++){
           factorials.add(factorial(i));
        }
        return factorials;
    }
    private long factorial(int num){
        if(num==0)return 1;
        long result=1;
        for(int i=1;i<=num;i++){
           result*=i;
        }
        return result;
    }
}
