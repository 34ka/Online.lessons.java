package lesson9.exceptions;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter {
    PrintWriter out;

    public PrintWriter(FileWriter fileWriter) {
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter("a.txt"));
        } catch(FileNotFoundException e) {
            System.err.println("Нет файла :( ");
            e.getMessage();//Метод возвращает String данные в логах. Френдли
            e.printStackTrace();//в консоль пишет ошибки эксепшена
        } catch(Exception e) {
            System.out.println("все ошибки");
        } finally {
            //actions Этот блок будет выполнен в любом случае, независимо от блока try и catch. Будет выполнено всегда
            //используется для очистки ресурсов. Закрывается конекшен в базе данных, например.
        }
    }

//    //алгоритм try, catch
//    try {
//        //код который хотим проверить
//    } catch (FileNotFoundException a/*указываем тип эксепшена. Только одного*/) {
//        //пишем обработчик ошибки. System.err.println("Нет файла :( ");
//    } catch (/*тип эксепшена другого*/) {
//    пишем обработчик ошибки. System.err.println("Нет чего-то другого :( ");
//    }
}
