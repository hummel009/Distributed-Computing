[![Code Smells][code_smells_badge]][code_smells_link]
[![Maintainability Rating][maintainability_rating_badge]][maintainability_rating_link]
[![Security Rating][security_rating_badge]][security_rating_link]
[![Bugs][bugs_badge]][bugs_link]
[![Vulnerabilities][vulnerabilities_badge]][vulnerabilities_link]
[![Duplicated Lines (%)][duplicated_lines_density_badge]][duplicated_lines_density_link]
[![Reliability Rating][reliability_rating_badge]][reliability_rating_link]
[![Quality Gate Status][quality_gate_status_badge]][quality_gate_status_link]
[![Technical Debt][technical_debt_badge]][technical_debt_link]
[![Lines of Code][lines_of_code_badge]][lines_of_code_link]

Мои лабораторные работы для BSUIR/БГУИР (белорусский государственный университет информатики и радиоэлектроники).

Предмет - RV/РВ (распределённые вычисления).

## Условия

Для всех работ применялся не рекомендуемый по условию Java + Spring + Maven, а Kotlin + Gradle + Ktor. Так тоже можно.

### Лабораторная работа 1: Архитектурный стиль REST

* Разрабатываемая система обрабатывает сущности Author, Issue, Sticker и Message, которые логически связаны отношениями
    * один-ко-многим (Author и Issue, Issue и Message)
    * многие-ко-многим (Issue, Sticker).
* Необходимо разработать решение в архитектурном стиле REST, с учетом перспективы развития приложения.

### Лабораторная работа 2: Слой хранения (JPA)

* Разрабатываемая система обрабатывает сущности Author, Issue, Sticker и Message, которые логически связаны отношениями
    * один-ко-многим (Author и Issue, Issue и Message)
    * многие-ко-многим (Issue, Sticker).
* Необходимо реализовать хранение сущностей в реляционной базе данных Postgres, с учетом перспективы развития
  приложения.

### Лабораторная работа 3: Модуляризация приложения с Cassandra

* Разрабатываемая система обрабатывает сущности Author, Issue, Sticker и Message, которые логически связаны отношениями
    * один-ко-многим (Author и Issue, Issue и Message)
    * многие-ко-многим (Issue, Sticker).
* Необходимо выполнить перенос хранения сущности Message из реляционной базе данных Postgres в новый модуль/микросервис
  с другой базой данных, а именно Cassandra.

<!----------------------------------------------------------------------------->

[code_smells_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=code_smells

[code_smells_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[maintainability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=sqale_rating

[maintainability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[security_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=security_rating

[security_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[bugs_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=bugs

[bugs_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[vulnerabilities_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=vulnerabilities

[vulnerabilities_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[duplicated_lines_density_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=duplicated_lines_density

[duplicated_lines_density_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[reliability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=reliability_rating

[reliability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[quality_gate_status_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=alert_status

[quality_gate_status_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[technical_debt_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=sqale_index

[technical_debt_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing

[lines_of_code_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Distributed-Computing&metric=ncloc

[lines_of_code_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Distributed-Computing
