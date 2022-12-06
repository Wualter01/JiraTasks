package Abstract;

public class InterfaceCalls implements InterfaceIntroduction{

    /* below methods will be inherited

    default void method1 (){};
static void method2 (){};

all three below need to be overridden so that i dont have any red error issues
public abstract void method3():public and abstract abstract
void method4(); public and abstract
void method5(); public and abstract
*/

    @Override
    public void method3(){

    }

    @Override
    public void method4(){//even tho i did not specify in interface class this method was public anything in
        //interface class by default is public

    }

    @Override
    public void method5(){

    }

}
