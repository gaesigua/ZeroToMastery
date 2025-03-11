package genericsandcollections;

//1. With this Generic class, I can get rid of the other three classes: ChihuahuaBag, LaptopBag, and BooksBag

public class Bag<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
