(ns winston.core
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (println "Hello, World. This is"x"!"))

(defn -main[& args]
  (foo args))
