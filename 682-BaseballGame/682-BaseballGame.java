// Last updated: 8/1/2025, 11:56:20 AM
class Solution {
    public int calPoints(String[] operations) {
      List<Integer> record=new ArrayList<>();
      int size=0;
      for(int i=0;i<operations.length;i++){
        if(operations[i].equals("+")){
            record.add(record.get(size-1)+record.get(size-2));
            size++;
        }
        else if(operations[i].equals("D")){
            record.add(record.get(size-1)*2);
            size++;
        }
        else if(operations[i].equals("C")){
           record.remove(size-1);
           size--;
        }
        else{
            record.add(Integer.parseInt(operations[i]));
            size++;
        }
      } 
      int sum=0;
       for (int num : record) {
            sum += num;
        }

        return sum;
    }
}