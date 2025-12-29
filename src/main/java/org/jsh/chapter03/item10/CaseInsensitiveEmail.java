package org.jsh.chapter03.item10;

import java.util.Objects;

public class CaseInsensitiveEmail {
    private final String email;

    public CaseInsensitiveEmail(String email) {
        this.email = Objects.requireNonNull(email);
    }

    // 대칭성 위배! (Broken Symmetry)
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveEmail) {
            return email.equalsIgnoreCase(((CaseInsensitiveEmail) o).email);
        }
        return false;
    }

    // hashCode는 나중에 다룰 거라 일단 대충 둠 (원래는 equals랑 같이 바꿔야 함)
    @Override
    public int hashCode() {
        return email.toLowerCase().hashCode();
    }
}