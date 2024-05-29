#include <iostream>

class I1 {
public:
    virtual void m(){
        std::cout << "m from I1" << std::endl;
    }
};

class I2 : public I1{
public:
    virtual void m(){
        std::cout << "m from I2" << std::endl;
    }
    virtual void n(){
        std::cout << "n from I2" << std::endl;
    }
};

class I3 : public I2{
public:
    //void (*)()
    virtual void p(){
        std::cout << "p from I3" << std::endl;
    }
};
class I4: public I1 {
    public:
    virtual void o() {
        std::cout << "o from I4" << std::endl;
    }
};

int main() {
    I3 *pi3 = new I3;
    long * vtable = *(long **)pi3;
    ((void (*)())vtable[1])();

    I4 *pi4 = new I4;
    long* vtable2 = *(long **)pi4;
    ((void (*)()) vtable2[0])();
    ((void (*)()) vtable2[1])();

    vtable[1] = vtable2[1];
    // trying to put i4 method into i3 like I am not supposed to. It's giving a "needs modifiable lvalue" error.
    // is there a way to make it work??
    return 0;
}