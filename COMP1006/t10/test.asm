global _main
extern _puts
section .text

test:
	push rbp
	lea rdi, [rel message]
	call _puts
	pop rbp
	ret

_main:
	jmp test
	ret
message:
	db 'test, world', 0
