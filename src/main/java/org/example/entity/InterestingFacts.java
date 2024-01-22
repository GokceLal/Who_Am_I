package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_interesting_facts")
@Entity
public class InterestingFacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "summary")
    String summary;

    @OneToOne(mappedBy = "interestingFacts", cascade = CascadeType.ALL)
    Celebrity celebrity;
}

