(ns clojure-ui-playground.multiplesOf3And5)

(defn multiples [input factor]
  (map #(* (+ 1 %) factor) (range (quot (- input 1) factor))))

(defn multiplesOf3And5
  "Computes the multiples of 3 and 5 that are in a given number and sums these distinct multiples.
  This is the solution to: https://projecteuler.net/problem=1"
  [input]
  (println "Running the multiples of 3 and 5 summed lower than:" input)
  (println "Value is:" (reduce + (distinct (concat (multiples input 3) (multiples input 5)))))
  (println))
