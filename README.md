## Приложение "Магазин игрушек" (Промежуточная аттестация по блоку специализация)

Выполнил: Лемпорт Александр

### Как запустить программу?

Запустить файл App.java на исполнение.

В меню программы можно выбрать пункт (2), добавление списком. Программа запросит две строки: строка с животными, строка с весами в %. Можно скопировать и ввести вот эти данные:

Мишка Обезьянка Слоник Баранчик Змейка Хрюшка Собачка Киска Динозаврик Птичка

50 50 30 30 20 10 10 5 5 5

После этого выбираем пункт (3), Розыгрыш игрушки. Данные записываются в файл toy_data.txt, он окажется в той директории, из которой происходит запуск (директории терминала).

На этом всё. Розыгрываем игрушки, пока они не кончатся. Выходим из программы, смотрим файл. Там имена игрушек и веса, которые им соответствовали.

### Задание
 
Необходимо написать программу на Java, для розыгрыша игрушек в магазине детских товаров.


### Описание программы
 
Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
Стараемся применять ООП и работу с файлами.
Если какой-то пункт не изучали и не знаете, как сделать, то можете сделать своим способом.
 
### Функционал

• В программе должен быть минимум один класс со следующими свойствами:
    ◦ id игрушки,
    ◦ текстовое название,
    ◦ количество
    ◦ частота выпадения игрушки (вес в % от 100)

• Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
• Возможность организовать розыгрыш игрушек.

### Подсказка 1

С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив.
Это список призовых игрушек, которые ожидают выдачи.
Еще у нас должен быть метод – получения призовой игрушки.
После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. А эту игрушку записываем в текстовый файл.
Не забываем уменьшить количество игрушек

### Подсказка 2

1) Напишите класс-конструктор у которого принимает минимум 3 строки,
содержащие три поля id игрушки, текстовое название и частоту выпадения
игрушки
2) Из принятой строки id и частоты выпадения(веса) заполнить минимум три
массива.
3) Используя API коллекцию: java.util.PriorityQueue добавить элементы в
коллекцию
4) Организовать общую очередь 
5) Вызвать Get 10 раз и записать результат в файл

### Пример работы

В метод put передаете последовательно несколько строк
1 2 конструктор;
2 2 робот;
3 6 кукла.

Метод Get должен случайно вернуть либо “2”, либо “3” и соответствии с весом.
В 20% случаях выходит единица
В 20% двойка
И в 60% тройка.


### Критерии оценки

* Приложение должно запускаться
* Записывать значения в файл
* Ошибок при выполнении программы быть не должно
