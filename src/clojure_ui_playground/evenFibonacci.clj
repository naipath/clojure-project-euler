(ns clojure-ui-playground.evenFibonacci)

(def fibonacci
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn evenForMax [maxValue]
  (take-while #(< % maxValue) (filter even? fibonacci)))

(defn evenFibonacci [maxValue]
  (println (str "Computing even fibonacci sum for: " maxValue))
  (println (str "Value is: " (reduce + (evenForMax maxValue))))
  )
