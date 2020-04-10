(ns clojure-ui-playground.evenFibonacci)

(def fibonacciSequence
  (->> [0 1]
       (iterate (fn [[a b]] [b (+ a b)]))
       (map first)))

(defn evenValuesForMaximum [maxValue]
  (->> fibonacciSequence
       (filter even?)
       (take-while #(< % maxValue))))

(defn evenFibonacci
  "Computes the even numbers in a fibonacci sequence with an upper bound.
  This is the solution to: https://projecteuler.net/problem=2"
  [maxValue]
  (println "Computing even fibonacci sum for:" maxValue)
  (println "Value is:" (reduce + (evenValuesForMaximum maxValue)))
  (println))
