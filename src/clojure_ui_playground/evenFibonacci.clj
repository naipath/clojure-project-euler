(ns clojure-ui-playground.evenFibonacci)

(def fibonacciSequence
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn evenValuesForMaximum [maxValue]
  (take-while #(< % maxValue) (filter even? fibonacciSequence)))

(defn evenFibonacci
  "Computes the even numbers in a fibonacci sequence with an upper bound.
  This is the solution to: https://projecteuler.net/problem=2"
  [maxValue]
  (println "Computing even fibonacci sum for:" maxValue)
  (println "Value is:" (reduce + (evenValuesForMaximum maxValue)))
  (println))
