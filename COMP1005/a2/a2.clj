;
; Assignment 2
;
(ns a2)
(defn -main [& args])
;
; Question 1
;
(defn factorial [n] (reduce *' (range 1 (+ n 1))))
;tests
(println (factorial 5))
(println (factorial 10))
(println (factorial 24))

;
; Question 2
;
(defn add_list [list] (reduce + list))
;tests
(println (add_list [1, 1, 1, 1]))
(println (add_list [1, 2, 3, 4]))
(println (add_list [5, 10, 1.5, 3]))
;
; Question 3
;
(defn average [list] (/ (add_list list) (count list)))
;tests
(println (average [1, 2, 3, 4]))
(println (average [100, 80, 90, 50, 70, 20, 100]))
(println (average [3, 2, 3, 3, 3, 3, 4]))

;
; Question 4
;
(defn threshold [a x] (filter #(> % x) a))
;tests
(println (threshold [1, 2, 5, 3, 6] 4))
(println (threshold (range 1 (+ 20 1)) 13))
(println (threshold (range 1 (+ 15 1)) 4.4))

;
; Question 5
;
(defn bmi_category [bmi] 
	(cond
		(< bmi 18.5) "underweight"
		(< bmi 25) "normal"
		(< bmi 30) "overweight"
		:else "obesecle"))
;tests
(println (bmi_category 18.4))
(println (bmi_category 24))
(println (bmi_category 25))
(println (bmi_category 9001))

;
; Question 6
(defn log2 
	([n] (log2 (quot n 2) 0))
	([n x] (if (> n 1) (log2 (quot n 2) (+ x 1)) (inc x))))
;tests
(println (log2 8))
(println (log2 9001))
(println (log2 23))