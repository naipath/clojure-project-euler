(ns euler.sumSquareDifference)

(defn sumOfSquares [input]
  (->> (range (inc input))
       (map #(* % %))
       (reduce +)))

(defn squareOfSums [input]
  (let [a (reduce + (range (inc input)))]
    (* a a)))

(defn
  sumSquareDifference
  "Computes the sum of all numbers squared minus the square of the sum.
  This is the solution to: https://projecteuler.net/problem=6"
  [input]
  (println "Sum squared difference is:" (- (squareOfSums input) (sumOfSquares input))))
