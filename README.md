# Автотесты для сайта [restful-api.dev](https://restful-api.dev)
## :pushpin: содержание:
___
+ [Стек технологий](#briefcase-стек-технологий)
+ [Запуск автотестов](#bow_and_arrow-запуск-автотестов)
+ [Сборка в Jenkins](#-сборка-в-jenkins)

____
## :briefcase: Стек технологий

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg"/></a>
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/logo/Java.svg"/></a>
<a href="https://rest-assured.io/"><img width="6%" title="Rest Assured" src="media/logo/RestAssured.svg"/></a>
<a href="https://github.com/allure-framework/allure2"><img width="6%" title="Allure Report" src="media/logo/Allure_Report.svg"/></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/logo/Gradle.svg"/></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/logo/JUnit5.svg"/></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/logo/GitHub.svg"/></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/logo/Jenkins.svg"/></a>
<a href="https://web.telegram.org/"><img width="6%" title="Telegram" src="media/logo/Telegram.svg"/></a>
</p>

___
+ IntelliJ IDEA - Интегрированная среда разработки программного обеспечения
+ Java - язык программирования, который был использован для написания автотестов
+ Allure Report - для формирования отчетов
+ Rest Assured - библиотека для работы с апи
+ Gradle - сборщик кода
+ JUnit - фреймворк для автоматического тестирования программ
+ GitHub - удаленный репозиторий для хранения кода
+ Jenkins - сервер для удаленного запуска тестов
+ Telegram - платформа для обмена сообщениями, куда будут приходить отчеты запуска тестов

___
**Содержание Allure-отчета:**
* Шаги теста;
* Скриншот страницы на последнем шаге;
* Page Source;
* Логи браузерной консоли;
* Видео выполнения автотеста.

## :bow_and_arrow: Запуск автотестов
___
**Команда запуска тестов локально, из терминала**
```
gradle clean test -DbaseUrl="https://api.restful-api.dev" -DbasePath="/objects"
```
## <img width="4%" style="vertical-align:middle" title="Jenkins" src="media/logo/Jenkins.svg"> [Сборка в Jenkins](https://jenkins.autotests.cloud/job/19-TimBart-DiplomApi/)
**Шаги для запуска тестов:**
1. Зайти в сборку
2. Перейти в раздел <code>Собрать с параметрами</code>
3. Выбрать необходимые параметры
4. Нажать кнопку <code>Собрать</code>

<p align="center">
<img title="Jenkins Build" src="media/screens/jenkins.png">
</p>

___
## <img width="4%" style="vertical-align:middle" title="Allure Report" src="media/logo/Allure_Report.svg"> [Пример Allure-отчета](https://jenkins.autotests.cloud/job/19-TimBart-DiplomApi/4/allure/)


<p align="center">
<img title="Allure Overview" src="media/screens/allure.png">
</p>

___

### <img width="4%" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/screens/Bot.png">
</p>
