(ns euler.palindrome)

(defn isPalindrome [i]
  (= (reverse i) (seq i)))

(defn reverseRange [input] (reverse (range input)))

(defn computePalindrome [total]
  (reduce max
          (for [x     (reverseRange total)
                y     (reverseRange total)
                :when (isPalindrome (str (* x y)))]
            (* x y))))

(defn palindrome
  "Computes the largest palindrome of the product of two three digit numbers.
  This is the solution to: https://projecteuler.net/problem=4"
  [size]
  (println (computePalindrome size)))

