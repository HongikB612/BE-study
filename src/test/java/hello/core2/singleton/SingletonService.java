package hello.core2.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}

/*
1. static 영역에 객체 instance를 미리 생성해서 올려둔다.
2. 이 객체 인스턴스가 필요하면 오직 getInstance()메소드를 통해서만 조회 가능. 이 메서드는 항상 같은 인스턴스 바환
3. 딱 1개의 객체 인스턴스만 존재해야 하므로 생성자를 private으로 막아서 혹시라도 외부에서 new 키워드로 객체 인스턴스가 생성되는 것을 막는다.
*/
