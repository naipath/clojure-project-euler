(ns clojure-ui-playground.multiplesOf3And5)

(defn multiplesOfFactor [input factor]
  (map #(* (+ 1 %) factor) (range (quot (- input 1) factor))))

(defn sumOfMultiples [total & inputs]
  (->> inputs
       (map #(multiplesOfFactor total %))
       (flatten)
       (distinct)
       (reduce +)))

(defn multiplesOf3And5
  "Computes the multiples of 3 and 5 that are in a given number and sums these distinct multiples.
  This is the solution to: https://projecteuler.net/problem=1"
  [input]
  (println "Running the multiples of 3 and 5 summed lower than:" input)
  (println "Value is:" (sumOfMultiples input 3 5))
  (println))
