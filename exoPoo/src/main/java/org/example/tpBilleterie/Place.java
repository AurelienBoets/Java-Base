package org.example.tpBilleterie;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
public class Place {
    @Setter
    @NonNull
    private String name, address;
    @Setter
    @NonNull
    private int capacity;

}
