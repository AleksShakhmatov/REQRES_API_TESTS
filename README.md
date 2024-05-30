# Проект по автоматизации сценариев тестирования API для сайта reqres.in

REQRES - Протестируйте свой интерфейс на реальном API.

## <img width="40" height="40" style="vertical-align:middle" title="Folder" src="media/images/yellow-computer-folder.png"> Содержание:

- <a href="#stech">Используемый стек технологий и инструментов</a>
- <a href="#check">Реализованные проверки</a>
- <a href="#engine">Запуск автотестов</a>
- <a href="#build">Сборка в Jenkins</a>
- <a href="#report">Интеграция с Allure</a>
- <a href="#testops">Интеграция с Allure TestOps</a>
- <a href="#jira">Интеграция с Jira</a>
- <a href="#telegram">Уведомления в Telegram через бота</a>

<a id="stech"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Folder" src="media/images/programm.jpg"> Используемый стек технологий и инструментов

| Java                                                    | IntelliJ  <br>  Idea                                            | GitHub                                                    | JUnit 5                                                   | Gradle                                                    | Selenide                                                    | Allure<br/>Report                                                | Allure <br> TestOps                                               | Jenkins                                                    | Jira                                                    |                                                    Telegram |
|:--------------------------------------------------------|-----------------------------------------------------------------|-----------------------------------------------------------|-----------------------------------------------------------|-----------------------------------------------------------|-------------------------------------------------------------|------------------------------------------------------------------|-------------------------------------------------------------------|------------------------------------------------------------|---------------------------------------------------------|------------------------------------------------------------:|
| <img height="50" src="media/logo/Java.svg" width="50"/> | <img height="50" src="media/logo/Intelij_IDEA.svg" width="50"/> | <img height="50" src="media/logo/GitHub.svg" width="50"/> | <img height="50" src="media/logo/JUnit5.svg" width="50"/> | <img height="50" src="media/logo/Gradle.svg" width="50"/> | <img height="50" src="media/logo/Selenide.svg" width="50"/> | <img height="50" src="media/logo/Allure_Report.svg" width="50"/> | <img height="50" src="media\logo\Allure_TestOps.svg" width="50"/> | <img height="50" src="media/logo/Jenkins.svg" width="50"/> | <img height="50" src="media/logo/Jira.svg" width="50"/> | <img height="50" src="media\logo\Telegram.svg" width="50"/> |

Тесты в проекте написаны на языке <code>Java</code> с использованием фреймворка  [Selenide](https://selenide.org/) и сборщика <code>Gradle</code>. <code>JUnit 5</code> задействован в качестве фреймворка модульного тестирования.
Для удаленного запуска реализована сборка в <code>Jenkins</code> с формированием Allure-отчета и отправкой результатов в <code>Telegram</code> при помощи бота. Также реализована интеграция с <code>Allure TestOps</code> и <code>Jira</code>.



<a id="chek"></a>
##  <img width="40" height="40" style="vertical-align:middle" title="List" src="media/images/todo.png"> Реализованные проверки
- Получение списка существующих пользователей и данных о них
- Получение списка занесённых в API цветов с описанием их кодов в системе Pantone и шестнадцатитеричном формате
- Получение ответа со статусом 404 при запросе несуществующего пользователя/цвета
- Создание пользователя
- Регистрация пользователя
- Редактирование данных пользователя
- Удаление пользователя (так как тренажёр не изменяет при этом список пользователей, проверяется лишь возвращаемый код 204)


<a id="engine"></a>
## <img height="40" src="media/images/play.jpg" title="Play" width="40"/> Запуск автотестов


### Запуск тестов из терминала локально:
```
gradle clean test 
```

<a id="build"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Jenkins" src="media/logo/Jenkins.svg"> [Сборка в Jenkins](https://jenkins.autotests.cloud/job/SH_Diploma_REQRES_API_TESTS/)

Для запуска сборки необходимо перейти в раздел **"Build with Parameters"** и нажать кнопку **"Build"**.
<p align="center">
<img title="Jenkins Build" src="media/screenshots/JenkinsBuild.png"> 
</p>

После выполнения сборки, в блоке **Build History** напротив номера сборки появятся значки <img src="media\logo\Allure_TestOps.svg" width="15" height="15">
и <img src="media\logo\Allure_Report.svg" width="15" height="15"> , при клике на которые откроются соответствующие
артефакты.

## <img width="40" height="40" style="vertical-align:middle" title="Allure Report" src="media/logo/Allure_Report.svg"> [Интеграция с Allure](https://jenkins.autotests.cloud/job/SH_Diploma_REQRES_API_TESTS/allure/)

<a id="report"></a>
### Allure отчет

<p align="center">   
<img title="Jenkins Build" src="media/screenshots/Allure_Report1.png">    
</p>

### Подробнее
<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report2.png">    
</p>       

<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report3.png">    
</p>  

<p align="center">     
<img title="Jenkins Build" src="media/screenshots/Allure_Report4.png">    
</p>  

## <img width="40" height="40" style="vertical-align:middle" title="Allure TestOps" src="media/logo/Allure_TestOps.svg"> [Интеграция с Allure TestOps](https://allure.autotests.cloud/launch/39383)


<a id="testops"></a>
### Allure TestOps отчет

#### Overview

<p align="center">    
<img title="Allure TestOps Overview" src="media/screenshots/Allure_TestOps1.png">
</p>

#### DashBoards
<p align="center">
<img title="Allure TestOps DashBoards" src="media/screenshots/Allure_TestOps2.png">
</p>

#### Подробнее

<p align="center">
<img title="Test Results in Alure TestOps" src="media/screenshots/Allure_TestOps3.png">
</p>


<a id="jira"></a>
## <img width="40" height="40" style="vertical-align:middle" title="Jira" src="media/logo/Jira.svg"> [Интеграция с Jira](https://jira.autotests.cloud/browse/HOMEWORK-1241)


<p align="center">
<img title="Jira Task" src="media/screenshots/Jira.png">
</p>

## <img width="40" height="40" style="vertical-align:middle" title="Telegram" src="media/logo/Telegram.svg"> [Уведомления в Telegram через бота](https://t.me/HW16Notification)


<a id="telegram"></a>
<p align="center">
<img title="Telegram Notifications" src="media/screenshots/Notifications.png">
</p>
