(ns euler.smallestMultiple)

; 1 is always divisable (saves 5% calculation time)
(def dividers (range 2 20))

; 19 is the highest prime in the sequence, so the number must be a coming from the table of 19
(def tableOf19 (range 38 2000000000 38))

(defn evenlyDivisable
  [input]
  (->> dividers
       (map #(rem input %))
       (filter pos?)
       (first)
       (nil?)))

(defn smallestMultiple
  "Computes the smallest number that can be evenly divided by 1 to 20.
  This is the solution to: https://projecteuler.net/problem=5"
  []
  (println "Largest number evenly divisible by 1 to 20 is:"
           (first (filter evenlyDivisable tableOf19))))
