import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Job{
public Integer st;
public Integer ed;
public Integer cost;
public Job() {
super();
}
public Job(Integer st, Integer ed, Integer cost) {
super();
this.st = st;
this.ed = ed;
this.cost = cost;
}
}
class Pair{
public Integer first;
public Integer second;
public Pair() {
super();
}
public Pair(Integer first, Integer second) {
super();
this.first = first;
this.second = second;
}
}
class SortingJobs implements Comparator<Job>{
@Override
public int compare(Job o1, Job o2) {
if(o1.ed<o2.ed) {
return 1;
}else {
return 0;
}
}
}
public class Application3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of job:");…