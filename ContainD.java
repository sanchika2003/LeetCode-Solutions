import java.util.HashSet;

class ContainD{
    public boolean ContainDuplicate(int[]nums){
    HashSet<Integer>set=new HashSet<>();
    for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
    }
    return false;
    }
}
