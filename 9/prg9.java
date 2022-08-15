package p9;

public class prg9 {
    public static void main(String[] args) {
        stack_interface istack;
        fixed_length_stack s1=new fixed_length_stack(10);
        dynamic_length_stack d1=new dynamic_length_stack(5);
        istack=s1;
        for(int i=0;i<11;i++){
            istack.push ((char)('A'+i));
        } System.out.print("\n");
        for(int i=0;i<11;i++){
            System.out.print(istack.pop()+" ");
        }
        System.out.print("\n");
        istack=d1;
        for(int i=0;i<26;i++){
            istack.push((char)('A'+i));
        }
        for(int i=0;i<26;i++){
            System.out.print(istack.pop()+" ");
        }
    }

    
}