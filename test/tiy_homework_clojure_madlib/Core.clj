(ns tiy-homework-clojure-madlib.Core)


(defn -main []

      (defn mad-lib [place person color thing name adjective1 adjective2 plural-things celebrity phrase]
            (println (str "Today I rode bus from " place " to " person ". I left early because I wasn't sure \n"
                           "where the bus stop was, but I saw a bright " color " sign right by the " thing
                            "\nso it was easy to find. The bus driver's name was '" name " the " adjective1 "'. \n"
                          "The only other passenger was a girl a year older, but all the seats were filled with \n"
                          adjective2 " " plural-things ". When the bus started moving, the girl turned to me and said, \n"
                          "'Want to hear the best advice I ever heard from " celebrity ": " phrase ".'"
                          )))

      (mad-lib "Disneyland" "Jamaica" "pink" "sidewalk" "Gina" "Weird" "gorgeous" "cookies" "Prince" "let it be")
      )