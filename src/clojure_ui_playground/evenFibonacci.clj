(ns clojure-ui-playground.evenFibonacci)

(def fibonacciSequence
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn evenValuesForMaximum [maxValue]
  (take-while #(< % maxValue) (filter even? fibonacciSequence)))

(defn evenFibonacci [maxValue]
  (println "Computing even fibonacci sum for:" maxValue)
  (println "Value is:" (reduce + (evenValuesForMaximum maxValue)))
  (println))
