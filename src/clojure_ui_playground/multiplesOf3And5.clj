(ns clojure-ui-playground.multiplesOf3And5)

(defn multiples [input factor]
  (map #(* (+ 1 %) factor) (range (quot (- input 1) factor))))

(defn multiplesOf3And5 [input]
  (println (str "Running the multiples of 3 and 5 summed lower than: " input))
  (println (str "Value is: " (reduce + (distinct (concat (multiples input 3) (multiples input 5)))))))
