|---------------------------------------------------------------------|
|                                 Schule                              |
|---------------------------------------------------------------------|
|- name: String = "UNKN"                                              |
|- schueler: int = 1                                                  |
|- ganztags: boolean = false                                          |
|- privat: boolean = false                                            |
|- klassen: int = 12                                                  |
|---------------------------------------------------------------------|
|+ Schule(neuName, neuGanztags, neuPrivat, neuSchueler, neuKlassen)   |
|+ Schule(neuName, neuSchueler, neuGanztags)                          |
|+ Schule(neuName, neuGanztags)                                       |
|+ Schule(neuName, neuPrivat, neuSchueler)                            |
|+ Schule(neuName)                                                    |
|+ Schule()                                                           |
|+ get/set Methoden                                                   |
|+ printSchule()                                                      |
|_____________________________________________________________________|
