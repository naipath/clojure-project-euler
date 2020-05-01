(ns euler.smalestMultiple)

; 1 is always divisable (saves 5% calculation time)
(def dividers (range 2 20))

; 19 is the highest prime in the sequence, so the number must be a coming from the table of 19
(def tableOf19 (range 19 2000000000 19))

(defn evenlyDivisable
  [input]
  (->> dividers
       (map #(rem input %))
       (filter pos?)
       (first)
       (nil?)))

(defn smalestMultiple
  "Computes the smalest number that can be evenly divided by 1 to 20.
  This is the solution to: https://projecteuler.net/problem=5"
  []
  (println "Largest number evenly divisible by 1 to 20 is:"
           (first (filter evenlyDivisable tableOf19))))
