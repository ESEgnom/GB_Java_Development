> # Java. Уровень 1

<details>
<summary>
Урок 1. Java. Введение
</summary>

## [Java. Введение](https://gbcdn.mrgcdn.ru/uploads/record/94057/attachment/90383a1632eef2df208aabcb16dfddfa.mp4)


### Практическое задание:
 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
 где a, b, c, d – аргументы этого метода, имеющие тип float.

 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
 8. * Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
</details>
<details>
<summary>
Урок 2. Основные конструкции
</summary>

## [Урок 2. Основные конструкции](https://gbcdn.mrgcdn.ru/uploads/record/94710/attachment/07b405bcf856c9d893833461326da5da.mp4)

### Практическое задание:
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
   Если выполнение задач вызывает трудности, можете обратиться к последней странице методического пособия. Для задач со * не нужно искать решение в интернете, иначе вы теряете весь смысл их выполнения.

</details>
<details>
 <summary>
  Урок 3. Практика
 </summary>

## [Урок 3. Практика](https://gbcdn.mrgcdn.ru/uploads/record/95723/attachment/a2fdc772c60ef48c4a1dfeb2ce1709b5.mp4)

### Практическое задание:
Делать только одну задачу.

1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
2. * Создать массив из слов
     String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
     При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
     apple – загаданное
     apricot - ответ игрока
     ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
     Для сравнения двух слов посимвольно можно пользоваться:
     String str = "apple";
     char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
     Играем до тех пор, пока игрок не отгадает слово.
     Используем только маленькие буквы.
</details>
<details>
<summary>
Урок 4. Крестики-нолики в процедурном стиле
</summary>

## [Урок 4. Крестики-нолики в процедурном стиле](https://gbcdn.mrgcdn.ru/uploads/record/96494/attachment/35c153d9df9ab3fdd8cb7a951a9b461b.mp4)
### Практическое задание:
1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
4. * Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
</details>
<details>
<summary>
Урок 5. Введение в ООП
</summary>

## [Урок 5. Введение в ООП](https://gbcdn.mrgcdn.ru/uploads/record/97440/attachment/e1d1673f0cd70b3e957d0bbcd1ee8790.mp4)

### Практическое задание:
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
4. Создать массив из 5 сотрудников.
   Пример:
```JAVA
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
```
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
</details>
<details>
<summary>
Урок 6. Продвинутое ООП
</summary>

## [Урок 6. Продвинутое ООП](https://gbcdn.mrgcdn.ru/uploads/record/98023/attachment/c4cc023bb1efea797b03a0d185573430.mp4)

### Практическое задание:
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
</details>
<details>
<summary>
Урок 7. Практика ООП и работа со строками
</summary>

## [Урок 7. Практика ООП и работа со строками](https://gbcdn.mrgcdn.ru/uploads/record/99017/attachment/3549910d2f33f6c88fc51d97d037fa57.mp4)

### Практическое задание:
1. Расширить задачу про котов и тарелки с едой. (брать из методички)
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
</details>
<details>
<summary>
Урок 8. Написание приложения с графическим интерфейсом
</summary>

## [Урок 8. Написание приложения с графическим интерфейсом](https://gbcdn.mrgcdn.ru/uploads/record/100785/attachment/aa03ca5248ef42cb6ac223c218068594.mp4)

### Практическое задание:
Калькулятор
1. Реализовать вычисление выражения для операций (без учета приоритетов): умножение, сложение, вычитание, деление
2. Реализовать поддержку работу чисел с плавающей запятой
3. Реализовать вычисление квадратного корня
4. * Попробовать применить ScriptEngine для вычисления сложный математических выражений
5. * Реализовать вычисление выражения для операций (с учетом приоритетов и без ScriptEngine): умножение, сложение, вычитание, деление
</details>