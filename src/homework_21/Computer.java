package homework_21;

/*
Создайте базовый класс Component с полями brand (бренд) и model (модель).++
Создайте производные классы: Processor, Memory, Storage от класса Component.++
Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.++
Реализуйте отношения между Computer и компонентами. Компоненты Processor и Memory не могу
существовать без компьютера.
 */
public class Computer {
    private final Processor processor;
    private final Memory memory;
    private final Storage storage;

    public Computer(Processor processor, Memory memory, Storage storage) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

}
