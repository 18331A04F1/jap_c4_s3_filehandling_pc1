package day2;

public class EvalGra extends Students{
    int total = 0;
    int avg=0;




    public void setDetail(String name, int maths, int social, int english, int physics){
        this.fname=name;
        this.maths=maths;
        this.social=social;
        this.physics=english;
        this.english=physics;

    }
    public void cTotal(){
        total=total+maths+social+physics+english;

    }
    public void avg(){
        avg=(total)/4;

    }
    public boolean passFail(int marks){
        return (marks>=5);
    }
    public void display(){
        System.out.println("student name is"+this.fname);
        System.out.println("maths marks are"+this.maths+" "+(passFail(this.maths)? "pass" : "fail -->reappear"));
        System.out.println("social marks are"+this.social+" "+(passFail(this.social)? "pass" : "fail -->reappear"));
        System.out.println("maths marks are"+this.physics+" "+(passFail(this.physics)? "pass" : "fail -->reappear"));
        System.out.println("maths marks are"+this.english+" "+(passFail(this.english)? "pass" : "fail -->reappear"));
    }


}
